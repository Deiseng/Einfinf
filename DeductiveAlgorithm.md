f(0,1).
   X>0 AND f(X-1,Y) -> f(X,2*Y).

f(X,64):
	(x-1, 32) --> (x-1, 32 * 2)
	(x-2, 16) --> (x-2, 16 * 2)
	(x-3, 8)  --> (x-3, 8 * 2)
	(x-4, 4)  --> (x-4, 4 * 2)
	(x-5, 2)  --> (x-5, 2 * 2)
	(x-6, 1)  --> (x-6, 2 * 1)
	
x muss 6 sein, damit f(X, 64) true ist.

f(X,67):
	(x-1, 33.5) -->(x-1, 33.5*2)
Kann nicht true werden, da 33.5 keine natürliche Zahl ist und mit Teilung durch 2 auch nicht werden kann.

f(3,Y):
	(2, 1) --> (2, 1 * 2)
	(1, 2) --> (1, 2 * 2)
	(0, 4) --> (0, 4 * 2)
Y muss 8 sein, damit f(3,Y) true ist. 
