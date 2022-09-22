//FUNCIÓN PARA GUARDAR LOS DATOS DE CREACIÓN EN JSON

let jsonCustomerData = []

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

    const birthdate = document.getElementById('birthdateInput').value
    const user = document.getElementById('userInput').value
    const password= document.getElementById('passwordInput').value
    const confirmPassword = document.getElementById('confirmPasswordInput').value

    // CALCULAR EDAD CON FECHA DE NACIMIENTO REGISTRADA
    const dateConvertion = new Date(birthdate) // ESTO COMVIERTE A FECHA A: Tue Jul 17 2018 19:00:00 GMT-0500 (hora estándar de Colombia) PARA 2018-07-18
    const today = new Date()
    let age = today.getFullYear() - dateConvertion.getFullYear()
    if (today.getMonth() < dateConvertion.getMonth() || (today.getMonth() == dateConvertion.getMonth() && today.getDate() < dateConvertion.getDate())) {
        age--
    }
    if (age < 18) { // VALIDAR LA FECHA DE NACIMIENTO
        console.log("La edad registrada no es válida, la fecha ingresada fue", birthdate, "que corresponde con la edad de", age, "años\nConversión de fecha", dateConvertion)
    }
    /*
    else if () { // SE EVALUARÁ SI EL USUARIO REGISTRADO YA EXISTE CON UN BOOLEANO
        console.log("El usuario ingresado ya esta registrado")
    }
    */
    else if (password != confirmPassword) {
        console.log("La confirmación de la contraseña no coincide")
    }
    else {
        const name = document.getElementById('nameInput').value
        const address = document.getElementById('addressInput').value

        //TEMPORAL
        const data = {
            name: name, address: address, birthdate: birthdate, user: user, password: password
        }
        jsonCustomerData.push(data)
        console.log("Los datos agregados son los siguientes:\n", data)
        console.log("Todos los datos guardados son:\n", jsonCustomerData)
        //HASTA AQUÍ ES LO TEMPORAL
    }
}