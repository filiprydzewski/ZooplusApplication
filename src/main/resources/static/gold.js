// Counting average gold price
let len = price.length;
let avgGoldPrice = 0;
for(let i=0; i<len; i++){
    avgGoldPrice = avgGoldPrice + price[i].cena;
}
avgGoldPrice = avgGoldPrice/len;
avgGoldPrice = avgGoldPrice.toFixed(2);

// Creating chart
const ctx = document.getElementById('myChart').getContext('2d');
const myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: [price[0].data, price[1].data, price[2].data, price[3].data, price[4].data, price[5].data, price[6].data, price[7].data, price[8].data, price[9].data, price[10].data, price[11].data, price[12].data, price[13].data],
            datasets: [{
                type: 'line',
                label: 'avg price',
                data: [avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice, avgGoldPrice],
                fill: 'false',
                backgroundColor: 'red',
                borderColor: 'red'
            },
                {
                    label: 'price',
                    data: [price[0].cena, price[1].cena, price[2].cena, price[3].cena, price[4].cena, price[5].cena, price[6].cena, price[7].cena, price[8].cena, price[9].cena, price[10].cena, price[11].cena, price[12].cena, price[13].cena],
                    backgroundColor: '#D4AC2B',
                    borderWidth: 3,
                    borderColor: '#B05E27'
                }
            ]
        },
        options: {
            title: {
                display: true,
                text: 'Average gold price for 1g last 14 days = ' + avgGoldPrice + ' zł',
            }
        }
    }
);



