
let adminLoggedIn = false;

//function validate(form){
    console.log("Inside admin form");
    const url = `https://localhost:8003/readalladmins`;
    async function getData(form){
        console.log("Inside getData");
        const response = await fetch(url);
        const data = await response.json();
        console.log(data);

        for (let i = 0; i <=2; i++) {
                
            if (form.userid.value == data.results[i].adminEmail && form.userpwd.value == data.results[i].adminPassword){
                adminLoggedIn = true;
                alert ("Login successful");  
                window.open("adminportal.html");
            }
            else{
                alert("Wrong username or password");

            }
        }

    }
    
//}

let adminIn = function(){
    if (!adminLoggedIn){
        return false;
    }
    else{
        return true;
    }
}

