mult(x, y) =
    if y = 0 then 0
      else x + mult(x, y - 1)
    fi

2) Behauptung:

  mult(x,y) = x * y für y≥0

3) Induktionsanfang:

  y = 0
  mult (x, 0) = x*0 = 0

4) Induktionsvorraussetzung:

  ∀0 ≤ z ≤ y   mult(x, z) = x*z

5) Induktionsschritt:

  mult (x, y+1) einsetzen

       z = x + mult (x, (y+1)-1)
       = x + mult (x, y)