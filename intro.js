let employee = {
    baseSalary: 30_000,
    overTime: 10,
    rate:20,
    getWage: function() {
        return this.baseSalary + (this.overTime * this.rate);    
    }
};

employee.getWage();
