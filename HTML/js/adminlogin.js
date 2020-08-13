
function validate(form){

    const url = `https://localhost:8003/readalladmins`;
    async function getData(){
    
        const response = await fetch(url);
        const data = await response.json();

        for (let i = 0; i <=2; i++) {
                console.log("Name: " + data.results[i].adminName);
                console.log("Username: " + data.results[i].adminEmail);
                console.log("Password: " + data.results[i].adminPassword);
            if (form.userid.value == data.results[i].adminEmail && form.userpwd.value == data.results[i].adminPassword){
                alert ("Login successful");  
            window.open("adminportal.html"); // Redirecting to other page.
            }
            else{
                alert("Wrong username or password");
            }
        }
    }
}
