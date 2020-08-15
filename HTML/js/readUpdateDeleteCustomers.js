
//https://cors-anywhere.herokuapp.com/
function readAllCustomers(){
fetch('http://localhost:8003/readallcustomers')
  .then(
    
    function(response) {
        
      if (response.status !== 200) {
        console.log('Looks like there was a problem. Status Code: ' +
          response.status);
        return;
      }

      // Examine the text in the response
      response.json().then(function(data) {
        console.log(data);
        drawTable(data);
      });
    }
  )
  .catch(function(err) {
    console.log('Fetch Error :-S', err);
  });


  }

  function drawTable(jsondata){
    let mountains = jsondata;
      
      function generateTableHead(table, data) {
        let thead = table.createTHead();
        let row = thead.insertRow();
        for (let key of data) {
          let th = document.createElement("th");
          let text = document.createTextNode(key);
          th.appendChild(text);
          // <tr>
          // <th>what ever the key is </th>
          // </tr>
          row.appendChild(th);
        }
        let a = document.createElement("th")
        let a1 = document.createElement("th")
        let b =document.createTextNode("Delete")
        let c= document.createTextNode("Update")
        a1.appendChild(b)
        a.appendChild(c)
        row.appendChild(a)
        row.appendChild(a1)
      }
          function generateTable(table, data) {
            for (let element of data) {
              let row = table.insertRow();
              for (key in element) {
          
                let cell = row.insertCell();
                cell.setAttribute('contentEditable', 'true');
                let text = document.createTextNode(element[key]);
                cell.appendChild(text);
              }

              function deleteCustomer(){
                let url = `http://localhost:8003/deletecustomer/${element.customerId}`;
                let heads = new Headers();
                heads.append('Content-type', 'application/json');
                let req = new Request(url, {
                  headers:heads,
                  method:'DELETE'
                });
                fetch(req)
                .then((res)=>res.json())
                .catch(err=>console.log(err));
              }

              let operation =row.insertCell();
              let bUpdate = document.createElement("button");
              bUpdate.i = "update" + element.customerId;
              bUpdate.name = "updateCustomer" +element.customerId;
              bUpdate.addEventListener("click", deleteCustomer);
              bUpdate.innerHTML = "update";
              operation.appendChild(bUpdate);

              let operation1 =row.insertCell();
              let bDelete = document.createElement("button");
              bDelete.id ="delete" + element.customerId;
              console.log()
              bDelete.addEventListener("click", deleteCustomer);
              bDelete.innerHTML = "Delete";
              operation1.appendChild(bDelete);
            }
          }
         
          let table = document.querySelector("table");
          table.innerHTML="";
          let data = Object.keys(mountains[0]);
          generateTableHead(table, data);
          generateTable(table, mountains);
        }
    


