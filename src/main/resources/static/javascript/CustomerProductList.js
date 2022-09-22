//CREAR TABLA DE BOTONES DINÁMICA Y METERLA EN CUSTOMER PRODUCT LIST

const jsonProductData = [
    {'Reference': 'PR1', 'Image Path': 'img/products/God of War.png', 'Name': 'God of War',
     'Game Type': 'Hack &apos;n&apos; Slash', 'Price': '$ 50.00'
    },
    {'Reference': 'PR2', 'Image Path': 'img/products/Doom Eternal.png', 'Name': 'Doom Eternal',
    'Game Type': 'FPS', 'Price': '$ 40.00'
    },
    {'Reference': 'PR3', 'Image Path': 'img/products/The Legend of Zelda Tears of the Kingdom.png', 'Name': 'The Legend of Zelda Tears of the Kingdom',
    'Game Type': 'Action RPG', 'Price': '$ 70.00'
    },
    {'Reference': 'PR4', 'Image Path': 'img/products/Super Smash Bros. Ultimate.png', 'Name': 'Super Smash Bros. Ultimate',
    'Game Type': 'Fighting', 'Price': '$ 60.00'
    }
  ]


// CREAR DIVISIONES PARA LOS JUEGOS EN EL HMTL

const buttonContainer = document.getElementById('buttonContainer');
console.log(jsonProductData)

for (let i = 0; i < jsonProductData.length; i++) {

    
    const outerDiv = document.createElement("div")
    outerDiv.setAttribute("class", "col-6")

    const innerDiv = document.createElement("div")
    innerDiv.setAttribute("type", "button")
    innerDiv.setAttribute("id", jsonProductData[i]['Reference']) //SE COLOCA A PARTIR DE LA BASE DE DATOS
    innerDiv.setAttribute("style", "height: 102%")
    innerDiv.setAttribute("onclick", "selectSample(this)")

    const gameImage = document.createElement("img")
    gameImage.setAttribute("src", jsonProductData[i]['Image Path']) //SE COLOCA A PARTIR DE LA BASE DE DATOS
    gameImage.setAttribute("width", 200)
    gameImage.setAttribute("height", 250)
    innerDiv.appendChild(gameImage)

    innerDiv.appendChild(document.createElement("br"))
    innerDiv.appendChild(document.createElement("br"))

    const header1 = document.createElement("h1")
    header1.innerHTML = jsonProductData[i]['Name'] //SE COLOCA A PARTIR DE LA BASE DE DATOS
    innerDiv.appendChild(header1)

    innerDiv.appendChild(document.createElement("br"))

    const header2 = document.createElement("h2")
    header2.innerHTML = "&nbsp;" + jsonProductData[i]['Game Type'] //SE COLOCA A PARTIR DE LA BASE DE DATOS
    innerDiv.appendChild(header2)

    innerDiv.appendChild(document.createElement("br"))
    
    const header3 = document.createElement("h3")
    header3.innerHTML = jsonProductData[i]['Price'] + "&nbsp;" //SE COLOCA A PARTIR DE LA BASE DE DATOS
    innerDiv.appendChild(header3)

    outerDiv.appendChild(innerDiv)
    buttonContainer.appendChild(outerDiv);
}

function selectSample(data) {
    console.log(data)
    console.log(data.getAttribute("id"))
}