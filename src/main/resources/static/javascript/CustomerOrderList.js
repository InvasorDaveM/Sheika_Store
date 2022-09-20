//CREAR TABLA DINÁMICA Y METERLA EN CUSTOMER ORDER LIST

const jsonData = [
    {'Book ID': '1', 'Book Name': 'Challenging Times',
     'Category': 'Business', 'Price': '125.60'
    },
    {'Book ID': '2', 'Book Name': 'Learn JavaScript',
     'Category': 'Programming', 'Price': '56.00'
    },
    {'Book ID': '3', 'Book Name': 'Popular Science',
     'Category': 'Science', 'Price': '210.40'
    }
  ]

  // Extract value from table header. 
  // ('Book ID', 'Book Name', 'Category' and 'Price')
  let titles = [];
  for (let i = 0; i < jsonData.length; i++) {
    for (let key in jsonData[i]) {
      if (titles.indexOf(key) === -1) {
        titles.push(key);
      }
    }
  }
  
  titles.push("Action")

  // Create table.
  const table = document.createElement("table");
  table.setAttribute("class", "table table-striped")
  table.setAttribute("style", "font-family: consolas; font-size: 17px");


  // Create table header row using the extracted headers above.
  let tr = table.insertRow(-1);                   // table row.

  for (let i = 0; i < titles.length; i++) {
    let th = document.createElement("th");      // table header.
    th.setAttribute("style", "color: #00c1d5");
    th.innerHTML = titles[i];
    tr.appendChild(th);
  }

  // add json data to the table as rows.
  for (let i = 0; i < jsonData.length; i++) {

    tr = table.insertRow(-1);

    for (let j = 0; j < titles.length; j++) {
      let tabCell = tr.insertCell(-1);
      tabCell.setAttribute("style", "color: white");
      if (j == titles.length - 1) {
        const button = document.createElement("button")
        button.setAttribute("class", "btn btn-primary")
        button.setAttribute("onclick","deleteSample(this)")
        button.setAttribute("style", "background-color: rgb(219, 143, 0); color: black")
        button.textContent = "Eliminar"
        tabCell.appendChild(button)
      }
      else {
        tabCell.innerHTML = jsonData[i][titles[j]];
      }
    }
  }

  // Now, add the newly created table with json data, to a container.
  const resultSearchPanel = document.getElementById('resultSearchPanel');
  resultSearchPanel.innerHTML = "";
  resultSearchPanel.appendChild(table);

  function deleteSample(data) {
    let s = data.parentNode
  }