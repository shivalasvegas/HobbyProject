
    async function getAdminData(form){
        console.log(form)
        let formData = new FormData(form);

        setTimeout(() => {}, 3000);

        const url = `http://localhost:8003/checkadmindetails/${formData.get("inputEmail")}/${formData.get("inputPassword")}`;
        console.log(url);
        const response = await fetch(url);
        const data = await response.json();
        console.log(data.results);

        if (data){
            alert ("Login successful");  
            window.location.replace("adminportal.html");
        }
        else{
            alert("Please enter a valid username and password.");
        }
    }
    


