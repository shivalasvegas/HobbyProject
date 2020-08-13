
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
      //console.log("My id is :",element.salesId)
          function generateTable(table, data) {
            for (let element of data) {
              let row = table.insertRow();
              for (key in element) {
                //console.log(element.salesId)
                
                let cell = row.insertCell();
                cell.setAttribute('contentEditable', 'true');
                let text = document.createTextNode(element[key]);
                cell.appendChild(text);
              }
              let operation =row.insertCell();
              let bUpdate = document.createElement("button");
              bUpdate.id = "update";
              bUpdate.name = "updateCustomer";
              bUpdate.innerHTML = "update";
              operation.appendChild(bUpdate);
              // let aTag = document.createElement("a");
              // aTag.href = `http://localhost:8003/updatecustomer/${element.id}`
              // aTag.id ="update"
              // aTag.name = "updateCustomer"
              // aTag.innerHTML = "Update"
              // operation.appendChild(aTag)
              let operation1 =row.insertCell()
              let aTagupdate = document.createElement("a");
              aTagupdate.href = `http://localhost:8003/deletecustomer/${element.id}`
              aTagupdate.id ="delete"
              aTagupdate.name = "deleteCustomer"
              aTagupdate.innerHTML = "Delete"
              operation1.appendChild(aTagupdate)
            }
          }
         
          let table = document.querySelector("table");
          let data = Object.keys(mountains[0]);
          generateTableHead(table, data);
          generateTable(table, mountains);
        }
    


