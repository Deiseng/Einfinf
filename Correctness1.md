x=13, y=5

Invariante: 0<=r and 0<y and q*y+r=x (bei jeder Wiederholung prüfen)
(Invariante darf sich, unter einer vorgegebenen Bedingung nicht verändern)

Vorbedingungen:
	x>=0 --> 13>0 (erfüllt)
	y>0	 -->  5>0 (erfüllt)
	
r:=x --> r=13	(r ist definiert als x)
q:=0			(q ist definiert als 0)

13 >= 5 --> r:= r-y 
			r=13-5 --> r=8
			q:=q+1
			q=0+1  --> q=1

8>=5 --> r:=r-y
			r=8-5  --> r=3
			q:=q+1
			q=1+1  --> q=2

3>=5 nicht erfüllt --> Ende der Schleife

Nachbedingungen:
	0<=r<y --> 0<=3<5 (erfüllt)
	q*y+r=x --> 2*5+3=13 (erfüllt)
	
Die partielle Korrektheit ist damit bewiesen, dass Vor- und Nachbedingungen beide erfüllt sind.	

	


