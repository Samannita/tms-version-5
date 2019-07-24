

    var productId = prompt("Enter the product id:");
    var productName = prompt("Enter the product Name:");
    var productPrice = prompt("Enter the product Price:");
    var productDescription = prompt("Enter the product Description:");


function Product(productId,productName,productPrice,productDescription){
    this.productId=productId;
    this.productName=productName;
    this.productPrice=productPrice;
    this.productDescription=productDescription;
    this.getProduct= function(){
        return "productId:" +this.productId +" " + "productName:" +this.productName + " "+ "productPrice:" + this.productPrice +" " + "productDescription:" + this.productDescription;
    }
};
var obj =new Product(productId,productName,productPrice,productDescription);
console.log(obj.getProduct());
