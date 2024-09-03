class User {
    id: number;
    name: number;
    state: boolean;
    //Pipe: is like a optional
    cellPhone: number | string
    //OPTIONAL VALUE: CAN O CANNOT BE VALUE
    permissions?: any[];
    //permission?: [string,string,string, boolean, number?,number?,object?]


}

function setUser() {
    let u: User = {id:123,name:123,state:true, cellPhone:"123455", permissions:['add','delete','update', true, 1,2,{user:"123",type:"123"}]};
}

function getUser(): User {
    return {id:123,name:123,state:true, cellPhone:"123455", permissions:['add','delete','update']};
    
}