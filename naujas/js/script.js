// 0 = ISBN
// 1 = isleidimo metai
// 2 = knygos pavadinimas
// 3 = puslapiu skaicius

let knygos = {
    grozine: [
        {
            isbn: 9789955089629,
            metai: 2018,
            pavadinimas: "Mano mintys debesyse",
            puslapiai: 300
        },
        {
            isbn: 9789955089629,
            metai: 1943,
            pavadinimas: "Mazasis princas",
            puslapiai: 104
        },
        {
            isbn: 9786098233346,
            metai: 2006,
            pavadinimas: "Bloga dukte",
            puslapiai: 250
        },
        {
            isbn: 9786098233391,
            metai: 2015,
            pavadinimas: "Mergina kuria jis pazinojo",
            puslapiai: 315
        },
        {
            isbn: 9786099609324,
            metai: 2019,
            pavadinimas: "Tapk ragana",
            puslapiai: 150
        },
        {
            isbn: 9786094792250,
            metai: 2019,
            pavadinimas: "Sfera",
            puslapiai: 240
        },
        {
            isbn: 9786099606323,
            metai: 2019,
            pavadinimas: "Lemtingi sprendimai",
            puslapiai: 672
        },
        {
            isbn: 9786094662829,
            metai: 2017,
            pavadinimas: "Vejas nuo juros",
            puslapiai: 416
        },
        {
            isbn: 9786098233650,
            metai: 2019,
            pavadinimas: "Taikiklyje",
            puslapiai: 320
        },
        {
            isbn: 9786098233704,
            metai: 2019,
            pavadinimas: "Kita ranka",
            puslapiai: 336
        }
    ]
}
for (let knyga in knygos){
    console.log("-----------------------")
    console.log(knyga + " literatura" + " (" + Object.keys(knygos[knyga]).length + " knygu):");
    for(let knyg of knygos[knyga]){
    console.log("-----------------------")
        if (knyg.metai === 2019){
        knyg.pavadinimas = knyg.pavadinimas + " (nauja knyga)"
        }
        for(let kny in knyg){
            console.log(kny + ": " + knyg[kny]);
        }
    }
}