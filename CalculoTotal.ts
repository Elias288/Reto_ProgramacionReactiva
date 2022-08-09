function CalcularIVA(cantidad:number, IVA:number): number{
	return cantidad + (IVA == 0 ? cantidad*0.21 : cantidad*IVA/100)
}

CalcularIVA(240, 23)
CalcularIVA(240, 0)