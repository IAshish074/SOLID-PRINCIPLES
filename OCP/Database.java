package OCP;

interface Database{
   public void saveToDB();
}


class SaveToSQL implements Database{
    public void saveToDB(){
        System.out.println("Saving to SQLDB...");
    }
}

class SaveToMongoDB implements Database{

    public void saveToDB(){
        System.out.println("Saving to MongoDB....");
    }
}