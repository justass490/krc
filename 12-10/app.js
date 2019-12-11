let currentCity = document.querySelector("#currentCity");
const inputCity = document.querySelector("#inputCity");
const citySearchBtn = document.querySelector(".btn");

const weatherByDayList = document.querySelectorAll(".weatherByDay");
const weatherToday = document.querySelector("#weatherToday");

citySearchBtn.addEventListener("click", () => {
   currentCity.textContent = inputCity.value;
});

weatherByDayList.forEach(day => {
    day.addEventListener("click", () => {
       // weatherToday.removeAttribute("id");
       // weatherToday.classList.add("weatherByDay");
       //  day.setAttribute("id", "weatherToday");
       //  day.classList.remove("weatherByDay");
    });
});



