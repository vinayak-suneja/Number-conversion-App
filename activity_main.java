package com.example.conversion;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
 RadioGroup group;
 RadioButton inType;
 CheckBox decimal, binary, octal, hex;
 Button convert;
 EditText num;
 TextView result;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 group = findViewById(R.id.radioGroup);
 decimal = findViewById(R.id.checkBox1);
 binary = findViewById(R.id.checkBox2);
 hex = findViewById(R.id.checkBox3);
 octal = findViewById(R.id.checkBox4);
 convert = findViewById(R.id.button);
 num = findViewById(R.id.num);
 result = findViewById(R.id.textView3);
 convert.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 result.setText("");
 inType =
(RadioButton)findViewById(group.getCheckedRadioButtonId());
 String type = inType.getText().toString();
 String number = num.getText().toString();
 if (type.matches("DECIMAL")){
 if(decimal.isChecked()){
 result.setText(result.getText() + "Decimal
conversion = " + number + "\n");
 }
if (binary.isChecked()){
 String ans =
Integer.toBinaryString(Integer.parseInt(number));
 result.setText(result.getText() + "Binary
conversion = " + ans + "\n");
 }
if (octal.isChecked()){
 String ans =
Integer.toOctalString(Integer.parseInt(number));
 result.setText(result.getText() + "Octal conversion
= " + ans + "\n");
 }
if (hex.isChecked()){
 String ans =
Integer.toHexString(Integer.parseInt(number));
 result.setText(result.getText() + "Hexadecimal
conversion = " + ans + "\n");
 }
 } else if(type.matches("BINARY")){
 if(decimal.isChecked()){
 String ans =
Integer.toString(Integer.parseInt(number,2));
 result.setText(result.getText() + "Decimal
conversion = " + ans + "\n");
 }
if (binary.isChecked()){
 result.setText(result.getText() + "Binary
conversion = " + number + "\n");
 }
if (octal.isChecked()){
 String ans =
Integer.toString(Integer.parseInt(number,2));
 String integer =
Integer.toOctalString(Integer.parseInt(ans));
 result.setText(result.getText() + "Octal conversion
= " + integer + "\n");
 }
if (hex.isChecked()){
 String ans =
Integer.toString(Integer.parseInt(number,2));
 String integer =
Integer.toHexString(Integer.parseInt(ans));
 result.setText(result.getText() + "Octal conversion
= " + integer + "\n");
 }
 } else if(type.matches("HEXADECIMAL")){
 if(decimal.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,16));
 result.setText(result.getText() + "Decimal
conversion = " + integer + "\n");
 }
if (binary.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,16));
 String ans =
Integer.toBinaryString(Integer.parseInt(integer));
 result.setText(result.getText() + "Binary
conversion = " + ans + "\n");
 }
if (octal.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,16));
 String ans =
Integer.toOctalString(Integer.parseInt(integer));
 result.setText(result.getText() + "Octal conversion
= " + ans + "\n");
 }
if (hex.isChecked()){
 result.setText(result.getText() + "Hexadecimal
conversion = " + number + "\n");
 }
 } else if(type.matches("OCTAL")){
 if(decimal.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,8));
 result.setText(result.getText() + "Decimal
conversion = " + integer + "\n");
 }
if (binary.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,8));
 String ans =
Integer.toBinaryString(Integer.parseInt(integer));
 result.setText(result.getText() + "Binary
conversion = " + ans + "\n");
 }
if (octal.isChecked()){
 result.setText(result.getText() + "Octal conversion
= " + number + "\n");
 }
if (hex.isChecked()){
 String integer =
Integer.toString(Integer.parseInt(number,8));
 String ans =
Integer.toHexString(Integer.parseInt(integer));
 result.setText(result.getText() + "Hexadecimal
conversion = " + ans + "\n");
 }
 }
 }
 });
 }
} 
