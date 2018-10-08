package AssemblyMachine.Machine;

import AssemblyMachine.Product.IProduct;
import AssemblyMachine.Product.Product;

public class AssemblyLine implements IAssemblyLine{

    private ILineStep first;
    private ILineStep second;
    private ILineStep third;

    public AssemblyLine(ILineStep first, ILineStep second, ILineStep third){
        System.out.println("Creating the product");
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(first.buildProductPart());
        product.installSecondPart(second.buildProductPart());
        product.installThirdPart(third.buildProductPart());
        System.out.println("Got the finished product!");
        return product;
    }
}
