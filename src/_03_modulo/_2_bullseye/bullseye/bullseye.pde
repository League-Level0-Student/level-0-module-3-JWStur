
void setup() {
  size(500,500);
  background(255,255,255);
  
}

void draw() {
  for (int i = 300; i >= 0; i-=15) {
     if (i % 2 == 0) {
        fill(0,0,0);
     }
     else {
       fill(255,0,0);
     }
     ellipse(250,250,i,i);
  }

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
