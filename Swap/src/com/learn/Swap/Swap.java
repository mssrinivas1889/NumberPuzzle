package com.learn.Swap;



import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("unused")
public class Swap extends Activity implements OnClickListener  {
    /** Called when the activity is first created. */
    
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,s;
 int i=0,j;    
  String a,b,c,d,x,y,z;
  String []f=new String[]{"02","04","06","08","01","03","05","07","09","10","12","11","15","14","13"};
           
  
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
  
        b1=(Button)findViewById(R.id.bt_1);
        b2=(Button)findViewById(R.id.bt_2);
        b3=(Button)findViewById(R.id.bt_3);
        b4=(Button)findViewById(R.id.bt_4);
        b5=(Button)findViewById(R.id.bt_5);
        b6=(Button)findViewById(R.id.bt_6);
        b7=(Button)findViewById(R.id.bt_7);
        b8=(Button)findViewById(R.id.bt_8);
        b9=(Button)findViewById(R.id.bt_9);
        b10=(Button)findViewById(R.id.bt_10);
        b11=(Button)findViewById(R.id.bt_11);
        b12=(Button)findViewById(R.id.bt_12);
        b13=(Button)findViewById(R.id.bt_13);
        b14=(Button)findViewById(R.id.bt_14);
        b15=(Button)findViewById(R.id.bt_15);
        b16=(Button)findViewById(R.id.bt_16);
        s=(Button)findViewById(R.id.swap);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        s.setOnClickListener(this);
        Toast.makeText(this,"Enter SWAP to start",Toast.LENGTH_LONG).show();
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
			switch (v.getId()) {
			case R.id.bt_1:
				a=b2.getText().toString();
				b=b5.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b2.setText(x);
					b1.setText(a);
					}else if(b.equals("")){
						x=((Button)v).getText().toString();
						b5.setText(x);
						b1.setText(b);
					}
				 break;
				 
			case R.id.bt_2:
				a=b1.getText().toString();
				b=b3.getText().toString();
				c=b6.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					
					b1.setText(x);
					b2.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					
					b3.setText(x);
					b2.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
				
					b6.setText(x);
					b2.setText(c);
				}
				 break;
			
				 
			case R.id.bt_3:
				a=b2.getText().toString();
				b=b4.getText().toString();
				c=b7.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b2.setText(x);
					b3.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b4.setText(x);
					b3.setText(b);
					
					}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b7.setText(x);
					b3.setText(c);
				}
			    break;
			
			case R.id.bt_4:
				a=b3.getText().toString();
				b=b8.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b3.setText(x);
					b4.setText(a);
					}else if(b.equals("")){
						x=((Button)v).getText().toString();
						b8.setText(x);
						b4.setText(b);
						}
				break;
			case R.id.bt_5:
				a=b1.getText().toString();
				b=b6.getText().toString();
				c=b9.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b1.setText(x);
					b5.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b6.setText(x);
					b5.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b9.setText(x);
					b5.setText(c);
				}
				
				 break;
				
			case R.id.bt_6:
				a=b2.getText().toString();
				b=b5.getText().toString();
				c=b7.getText().toString();
				d=b10.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b2.setText(x);
					b6.setText(a);
		        	}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b5.setText(x);
					b6.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b7.setText(x);
					b6.setText(c);
				}else if(d.equals("")){
					x=((Button)v).getText().toString();
					b10.setText(x);
					b6.setText(d);
				}
				 break;
			case R.id.bt_7:
				a=b3.getText().toString();
				b=b6.getText().toString();
				c=b8.getText().toString();
				d=b11.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b3.setText(x);
					b7.setText(a);
		        	}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b6.setText(x);
					b7.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b8.setText(x);
					b7.setText(c);
				}else if(d.equals("")){
					x=((Button)v).getText().toString();
					b11.setText(x);
					b7.setText(d);
				}
				 break;
			case R.id.bt_8:
				a=b4.getText().toString();
				b=b7.getText().toString();
				c=b12.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b4.setText(x);
					b8.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b7.setText(x);
					b8.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b12.setText(x);
					b8.setText(c);
				}
				
				 break;
				 
			case R.id.bt_9:
				a=b5.getText().toString();
				b=b10.getText().toString();
				c=b13.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b5.setText(x);
					b9.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b10.setText(x);
					b9.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b13.setText(x);
					b9.setText(c);
				} 
				 break;
			case R.id.bt_10:
				a=b6.getText().toString();
				b=b9.getText().toString();
				c=b11.getText().toString();
				d=b14.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b6.setText(x);
					b10.setText(a);
		        	}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b9.setText(x);
					b10.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b11.setText(x);
					b10.setText(c);
				}else if(d.equals("")){
					x=((Button)v).getText().toString();
					b14.setText(x);
					b10.setText(d);
				}
				 break;
			case R.id.bt_11:
				a=b7.getText().toString();
				b=b10.getText().toString();
				c=b12.getText().toString();
				d=b15.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b7.setText(x);
					b11.setText(a);
		        	}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b10.setText(x);
					b11.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b12.setText(x);
					b11.setText(c);
				}else if(d.equals("")){
					x=((Button)v).getText().toString();
					b15.setText(x);
					b11.setText(d);
				} 
				 break;
			case R.id.bt_12:
				a=b8.getText().toString();
				b=b11.getText().toString();
				c=b16.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b8.setText(x);
					b12.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					b11.setText(x);
					b12.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
					b16.setText(x);
					b12.setText(c);
				}
				 break;
			case R.id.bt_13:
				a=b9.getText().toString();
				b=b14.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b9.setText(x);
					b13.setText(a);
					}else if(b.equals("")){
						x=((Button)v).getText().toString();
						b14.setText(x);
						b13.setText(b);
					}
				 break;
			case R.id.bt_14:
				a=b10.getText().toString();
				b=b13.getText().toString();
				c=b15.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					
					b10.setText(x);
					b14.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					
					b13.setText(x);
					b14.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
				
					b15.setText(x);
					b14.setText(c);
				}
				 break;
			case R.id.bt_15:
				a=b11.getText().toString();
				b=b14.getText().toString();
				c=b16.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					
					b11.setText(x);
					b15.setText(a);
		        	
			}
				else if(b.equals("")){
					x=((Button)v).getText().toString();
					
					b14.setText(x);
					b15.setText(b);
				}else if(c.equals("")){
					x=((Button)v).getText().toString();
				
					b16.setText(x);
					b15.setText(c);
				}
				 break;
			case R.id.bt_16:	
				a=b12.getText().toString();
				b=b15.getText().toString();
				if(a.equals("")){
					x=((Button)v).getText().toString();
					b12.setText(x);
					b16.setText(a);
					}else if(b.equals("")){
						x=((Button)v).getText().toString();
						b15.setText(x);
						b16.setText(b);
					}
				 break;
			case R.id.swap:
				b16.setText("");
				for(j=0;j<10;j++){
					if(j==0||j==2||j==5||j==9){
						i=1;
					
				b1.setText(f[i]);
				b3.setText(f[i+1]);
				b5.setText(f[i+2]);
				b7.setText(f[i+3]);
				b9.setText(f[i+4]);
				b11.setText(f[i+5]);
				b13.setText(f[i+6]);
				b15.setText(f[i+7]);
				b2.setText(f[i+8]);
				b4.setText(f[i+9]);
				b6.setText(f[i+10]);
				b8.setText(f[i+11]);
				b10.setText(f[i+12]);
				b12.setText(f[i+13]);
				b14.setText(f[i-1]);
					}
					else{
						i=0;
						b1.setText(f[i]);
						b3.setText(f[i+1]);
						b5.setText(f[i+2]);
						b7.setText(f[i+3]);
						b9.setText(f[i+4]);
						b11.setText(f[i+5]);
						b13.setText(f[i+6]);
						b15.setText(f[i+7]);
						b2.setText(f[i+8]);
						b4.setText(f[i+9]);
						b6.setText(f[i+10]);
						b8.setText(f[i+11]);
						b10.setText(f[i+12]);
						b12.setText(f[i+13]);
						b14.setText(f[i+14]);
					}
					
				}
			 break;
		   }
	}
}
		
			
		
		
	

