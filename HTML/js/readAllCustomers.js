

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
                let text = document.createTextNode(element[key]);
                cell.appendChild(text);
              }
              let operation =row.insertCell();
              let myForm = document.createElement("form");
              myForm.action=`http://localhost:8003/deletecustomer/${element.customerId}`;
              myForm.method = "POST";

              let aTag = document.createElement("a");
              aTag.href = `http://localhost:8003/updatecustomer/${element.customerId}`;
          
              aTag.id = "updateCustomer";
              aTag.innerHTML = "Update";
              aTag.onclick="this.parentNode.submit();"
              myForm.appendChild(aTag);
              operation.appendChild(myForm);

              let operation1 =row.insertCell();
              let aTagupdate = document.createElement("a");
              aTagupdate.href = `http://localhost:8003/deletecustomer/${element.customerId}`;
              
              let myForm1 = document.createElement("form");
              myForm1.method = "POST";
              myForm1.action=`http://localhost:8003/deletecustomer/${element.customerId}`;
           
              function Redirect() {
                location.href = "https://www.tutorialspoint.com";
             }            
              aTagupdate.innerHTML = "Delete";
              aTagupdate.onLoad = function(event){
                //event.preventDefault(); 
                event.stopImmediatePropagation(); 
                //return (location.href = "http://127.0.0.1:5500/html/adminportal.html");
                location.href = "https://www.tutorialspoint.com";
                //return false;
                
                //location.reload(true);
                //setTimeout(Redirect(), 300); 
              }
              // myForm1.onsubmit = function(event){
              //   event.preventDefault(); 
              //   location.reload(true);
              //   event.setTimeout(Redirect(), 3000); 
              //   } ;
              // event.preventDefault();
              myForm1.appendChild(aTagupdate);
              
              operation1.appendChild(myForm1);
              

            }
          }
         
          let table = document.getElementById("updateDelete");
          let data = Object.keys(mountains[0]);
          generateTableHead(table, data);
          generateTable(table, mountains);
        
        }


