
let adminLoggedIn = false;


    console.log("Inside admin form");
    const url = "http://localhost:8003/readalladmins";

    async function getAdminData(form){
        console.log("Inside getData");
        //let formData = new FormData(form);


        const response = await fetch(url);
        const data = await response.json();

        console.log(data.results);

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
    


