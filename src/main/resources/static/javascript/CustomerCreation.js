//FUNCIÓN PARA GUARDAR LOS DATOS DE CREACIÓN EN JSON

let jsonData = []

/* SI NO SE USA onclick EN EL HTML, TOCA CREAR UN .js PARA CADA VISTA, PARA LA PRUEBA CON JSON SE USARÁ SÓLO ESTE ARCHIVO .js

document.getElementById("createCustomer").onclick = () => {
    const name = document.getElementById('nameInput').value
    const address = document.getElementById('addressInput').value
    const birthdate = document.getElementById('birthdateInput').value
    const user = document.getElementById('userInput').value
    const password = document.getElementById('passwordInput').value
    const confirmPassword = document.getElementById('confirmPasswordInput').value



    // TODO LO SIGUIENTE ES TEMPORAL
    const data = {
        name: name, address: address, birthdate: birthdate, user: user, password: password, confirmPassword: confirmPassword
    }
    jsonFile.push(data)
    const showCurrentCreation = JSON.stringify(data)
    console.log("Los datos agregados son los siguientes:\n", showCurrentCreation)
    console.log(jsonFile)
    return false
    //HASTA AQUÍ ES LO TEMPORAL
}
*/
function insertCustomerData() {
    const name = document.getElementById('nameInput').value
    const address = document.getElementById('addressInput').value
    const birthdate = document.getElementById('birthdateInput').value
    const user = document.getElementById('userInput').value
    const password= document.getElementById('passwordInput').value
    const confirmPassword = document.getElementById('confirmPasswordInput').value



    //TEMPORAL
    const data = {
        name: name, address: address, birthdate: birthdate, user: user, password: password, confirmPassword: confirmPassword
    }
    jsonData.push(data)
    console.log("Los datos agregados son los siguientes:\n", data)
    console.log("Todos los datos guardados son:\n", jsonData)
    //HASTA AQUÍ ES LO TEMPORAL
}

var jsonFile = JSON.stringify(jsonData)