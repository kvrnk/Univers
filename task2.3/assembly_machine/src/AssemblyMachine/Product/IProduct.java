package AssemblyMachine.Product;

import AssemblyMachine.Parts.IProductPart;

public interface IProduct {
    public void installFirstPart(IProductPart productPart);
    public void installSecondPart(IProductPart productPart);
    public void installThirdPart(IProductPart productPart);
}
