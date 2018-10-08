package AssemblyMachine.Machine;

import AssemblyMachine.Product.IProduct;

public interface IAssemblyLine {
     public IProduct assembleProduct(IProduct product);
}
