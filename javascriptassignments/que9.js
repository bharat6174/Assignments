var empdetails = (name, city, salary) => {
    console.log(`Welcome ${name} from ${city}.`);
    var bonus = () => {
        const newSalary = salary + 0.2*salary;
        console.log(`Your salary is ${newSalary}.`);
    }
    return bonus();
}


empdetails("Bharat", "Gurgaon", 40000);