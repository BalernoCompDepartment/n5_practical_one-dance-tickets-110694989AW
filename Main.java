class Main {
  public static void main(String[] args) {
    
    String groupName = Keyboard.getText("what is your group called?");
    int groupNumber = Keyboard.getInt("how many members does your group have?");
    
    while (groupNumber < 4 || groupNumber > 10) {
      Screen.display("error, you can't have a group with that number", "error screen");
      groupNumber = Keyboard.getInt("how many members does your group have?");
    }
    
    String output = "group name: " + groupName + "\n" + "number in group: " + groupNumber + "\n";
    
    for (int index = 0; index < groupNumber; index++) {
      output = output + Keyboard.getText("what is person " + (index + 1) + "'s name?") + " - ";
      
      String photo = Keyboard.getText("would you like a photo ticket? answer only yes or no");
      
      int check = 0;
      
      while (check == 0){
      if (photo.equals("yes")) {
        output = output + "£4.99" + "\n";
        check = 1;
      } else if (photo.equals("no")) {
        output = output + "£3.00" + "\n";
        check = 1;
      } else {
        photo = Keyboard.getText ("would you like a photo ticket? answer only yes or no");
      }
      }
    }
    
    Screen.display(output, "table");
  }
}








