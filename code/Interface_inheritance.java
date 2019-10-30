// Vererbung:
interface I1 extends I2 {...}
// Mehrfachimplementation:
class C implements I1, I2 {...}
// Kombination:
class C1 extends C2 implements I1, I2 {...}