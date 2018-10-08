package AssemblyMachine.Product;

import AssemblyMachine.Parts.Corpus;
import AssemblyMachine.Parts.IProductPart;
import AssemblyMachine.Parts.Lenses;
import AssemblyMachine.Parts.TempleTips;


public class Product implements IProduct {

    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    public Product(){
        
    }

    @Override
    public void installFirstPart(IProductPart part) {
        System.out.println("Install the first part");
         firstPart = part;
    }

    @Override
    public void installSecondPart(IProductPart part) {
        System.out.println("Install the second part");
        secondPart = part;
    }

    @Override
    public void installThirdPart(IProductPart part) {
        System.out.println("Install the third part");
        thirdPart = part;
    }
}
