package swing_Object_BT5_4;

public class Product {
String nameProduct, priceProduct, imageView;
public Product(String nameProduct, String priceProduct, String imageView) {
	super();
	this.nameProduct = nameProduct;
	this.priceProduct = priceProduct;
	this.imageView = imageView;
}

public String getNameProduct() {
	return nameProduct;
}

public void setNameProduct(String nameProduct) {
	this.nameProduct = nameProduct;
}

public String getPriceProduct() {
	return priceProduct;
}

public void setPriceProduct(String priceProduct) {
	this.priceProduct = priceProduct;
}

public String getImageView() {
	return imageView;
}

public void setImageView(String imageView) {
	this.imageView = imageView;
}


}
