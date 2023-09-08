var menuDetails = (username, type) => {
    
    const vegFood = ["Paneer","Sambhar","Rasam","Dosa","Idli"];
    const nonVegFood = ["Kadhai Chicken", "Fish Pakora", "Beacon", "Crispy Chicken Burger"];
    
    console.log(`Welcome ${username}`);

    if (type === "veg") {
        console.log("Vegetarian Menu:");
        vegFood.forEach(ele => console.log(ele));
    } else if (type === "nonveg") {
        // Print non-veg food items
        console.log("Non-Vegetarian Menu:");
        nonVegFood.forEach(ele => console.log(ele));
    } else {
        console.log("Enjoy Fasting");
    }
};

menuDetails('Sri', 'nonveg');
console.log("");
menuDetails('Nitesh', 'veg');
console.log("");
menuDetails('Dhanu', 'other');