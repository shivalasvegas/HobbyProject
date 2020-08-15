
function validate(form){

    const url = `https://localhost:8003/readalladmins`;
    async function getData(){
    
        const response = await fetch(url);
        const data = await response.json();

        for (let i = 0; i <=2; i++) {
                
            if (form.userid.value == data.results[i].adminEmail && form.userpwd.value == data.results[i].adminPassword){
                alert ("Login successful");  
                window.open("adminportal.html"); 
            }
            else{
                alert("Wrong username or password");
            }
        }
    }
}
