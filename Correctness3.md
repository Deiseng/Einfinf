Aufgabe 1

1.	Vorbedingung Y≥0
	Nachbedingung Z=XY
	Schleifeninvariante P: X^Y = Z*X^W

	POW:
	var W,X,Y,Z :int;
	input X,Y;
	Z := 1;
	W := Y;
	while W != 0 do
		Z := Z*X;
		W := W -1;
	od;
	output Z;
  
	Vorbedingung Y>=0:
		mit Y=0:
			W!=0 nicht erfüllt --> Output Z --> Z=1
	Nachbedingung mit Y=0
		Z=X^Y --> 1=X^0 --> korrekt

	Schleifeninvariante mit Y=0:
	X = 2 gewählt (keine Einschränkung)
	2^=1*2^0 ---> 1=1 korrekt

	mit 1 ebenfalls alles korrekt
	
2.	Man müsste zeige, dass POW immer terminiert, wenn die Vorbedingungerfüllt ist.


Aufgabe 2

1.	pow(x,y) = if y = 0 then 1
           else mult(pow(x,pred(y)),x)
           fi
	mit mult(x,y) = x*y und pred(x) = x-1.
	Für y=0

	pow(x, 0) --> if y=0(erfüllt) then 1 --> pow (x, 0)=1
	x^y --> x^0 --> x^0=1
	1=1

	pow(x,(y+1)) 		= x^(y+1)
	x*(pow(x,((y+1)-1) 	= ...
	x*(pow(x,(y))		=...
	...			 		= x*(x^y)
	x*(pow(x,(y))		= x*(x^y)
	
	
2.	Eine partielle Funktion ist eine Funktion, bei der jedem Element der einen Menge, nur ein Element einer anderen Menge 
	zugeordnet wird. Bezogen auf die Funktion sieht man hier, dass, für ein bestimmtes x und ein bestimmtes y, nur ein bestimmtes
	Ergebniss existiert und nicht etwa 2. Als Beispiel 2^3 (2,3) ist immer 8 und hat nie ein anderes Ergebniss. Man nennt 
	dies auch eine rechtseindeutige Funktion.
	
