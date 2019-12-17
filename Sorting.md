1. 
Bei Selection Sort sucht man in der Menge von Zahlen nach der kleinsten Zahl und vertauscht diese mit der Zahl auf der ersten Position.
Danach sucht man die zweitkleinste Zahl und tauscht diese mit der auf der zweiten Position ... usw.

Bei Insertion Sort wird die erste Zahl in der Menge bereits als sortiert angenommen. Darauf hin nimmt man die nächste Zahl, vergleicht sie mit der als sortiert angenommenen und stellt sie entweder davor oder dahinter
(z.B. 5 als sortiertangenommen und nächste Zahl ist 9 --> 9>5 --> neue sortierte Abfolge lautet also 5, 9). Danach nimmt man die dritte Zahl, vergleicht sie mit den beiden anderen und ordnet sie dementsprechen in die
sortierte Abfolge ein( z.B. als nächste Zahl 8 --> 8<9 und 8>5 --> neue Abfolge ist 5, 8, 9). Dies wiederholt man, bis man alle zahlen richtig eingeordnet hat.

Unterschiede: 
Bei Selection Sort müssen immer nur 2 Zahlen verglichen werden, während der Aufwand des Vergleichens bei Insertion Sort mit zunehmender Menge der Zahlen drastisch steigen kann, da es im worst case Szenario dazu kommen kann,
dass man die zu vergleichende Zahl immer mit allen vergleichen muss.

2. 
Insertion Sort ist stabil (wenn angenommen, dass Zahlen wenn sie beim vergleichen gleich sind nicht miteinander getauscht werden. BSP: unsortiertes Array von Zahlen {2, 2', 1) --> 1, 2, 2'
Denn hier verändert sich der schlüssel von 2 und 2' nicht (mit Schlüssel ist hier die Reihenfolge gemeint).

3.
Der Aufwand würde sich (nach grober Schätzung) fünfteln, da man nicht mehr von vorne nach hinten suchen müsste, sondern die schon sortierte Folge Teilen könnte und dann jeweils nur abschätzen muss, in welcher Hälfte sich die Stelle zum einfügen befindet
und diese dann wieder teilt etc. Dieser Unterschied würde sich besonders bei großen Mengen bemerkbar machen. 

20: tauschen mit 1. Element
 
 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 1  20 vergleiche bei linear
													 4 Mal Teilen 
													