//CREAR TABLA DINÁMICA Y METERLA EN CUSTOMER ORDER LIST

const jsonOrderData = [
    {'Code':'CO1', 'Product/s Bought': 'The Legend of Zelda Breath of the Wild', 'Order Date': '2022-05-02',
     'Delivery Date': '2022-05-05', 'Total Amount': '$ 60.00'
    },
    {'Code':'CO2', 'Product/s Bought': 'Mario Oddesey<br>Cook Simulator', 'Order Date': '2022-01-19',
    'Delivery Date': '2022-01-22', 'Total Amount': '$ 80.00'
    },
    {'Code':'CO3', 'Product/s Bought': 'Farm Simulator', 'Order Date': '2022-07-21',
    'Delivery Date': '2022-07-24', 'Total Amount': '$ 20.00'
    }
  ]

  // EXTREAR EL NOMBRE DE LAS COLUMNAS ('Product/s Bought', 'Order Date', 'Delivery Date', 'Total Amount')
  let keyNames = [];
  for (let i = 0; i < jsonOrderData.length; i++) {
    for (let key in jsonOrderData[i]) {
      if (keyNames.indexOf(key) === -1) {
        keyNames.push(key);
      }
    }
  }
  
  // AÑADIR COLUMNA DE BOTONES
  keyNames.push("Action")

  // CREAR TABLA EN EL HMTL
  const table = document.createElement("table");
  table.setAttribute("class", "table table-striped")
  table.setAttribute("style", "font-family: consolas; font-size: 17px");


  // AÑADIR EL NOMBRE DE LAS COUMNAS A LA TABLA DEL HTML
  let tr = table.insertRow(-1);                   // INSERTAR LA FILA

  for (let i = 0; i < keyNames.length; i++) {
    if(i != 0) {              // INSERTAR LOS NOMBRES DE CADA COLUMNA MENOS 'Code' QUE ES UN DATO ESCONDIDO
      let th = document.createElement("th");      
      th.setAttribute("style", "color: #00c1d5");
      th.innerHTML = keyNames[i];
      tr.appendChild(th);
    }
  }

  // AÑADIR LOS DATOS DEL JSON
  for (let i = 0; i < jsonOrderData.length; i++) {

    tr = table.insertRow(-1);

    for (let j = 0; j < keyNames.length; j++) {
      if (j != 0) {   // INSERTAR LOS DATOS DEL JSON MENOS 'Code' QUE ES UN DATO ESCONDIDO
        let td = tr.insertCell(-1);
        td.setAttribute("style", "color: white");
        if (j == keyNames.length - 1) {
          const button = document.createElement("button")
          button.setAttribute("class", "btn btn-primary")
          button.setAttribute("id", jsonOrderData[i][keyNames[0]])
          button.setAttribute("onclick","deleteSample(this)")
          button.setAttribute("style", "background-color: rgb(219, 143, 0); color: black")
          button.textContent = "Delete"
          td.appendChild(button)
        }
        else {
          td.innerHTML = jsonOrderData[i][keyNames[j]];
        }
      }
    }
  }

  // METER LA TABLA EN resurtSearchPanel
  const resultSearchPanel = document.getElementById('resultSearchPanel');
  resultSearchPanel.appendChild(table);

  function deleteSample(data) {
    console.log(data)
    console.log(data.getAttribute("id"))
  }