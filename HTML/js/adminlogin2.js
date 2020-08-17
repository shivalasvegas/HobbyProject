
let adminLoggedIn = false;


    console.log("Inside admin form");
    const url = "http://localhost:8003/readalladmins";

    async function getAdminData(form){
        console.log("Inside getData");
        
        fetch(url)
        .then(
            function(response) { 
        if (response.status !== 200) {
            console.log('Looks like there was a problem. Status Code: ' +
            response.status);
            return;
        }
      response.json().then(function(data) {
        console.log(data);
        
        });
        }
        )
    .catch(function(err) {
        console.log('Fetch Error :-S', err);
    });

        for (let i = 0; i <=2; i++) {
            console.log("inside if statment");
            console.log(form.username.value);
            console.log(form.username.value + " = " + data.results[i].adminEmail);
            if (form.username.value == data.results[i].adminEmail && form.userpwd.value == data.results[i].adminPassword){
                
                adminLoggedIn = true;
                alert ("Login successful");  
                window.open("adminportal.html");
            }
            else{
                alert("Wrong username or password");

            }
        }

    }
    


