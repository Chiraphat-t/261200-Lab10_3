public class ImageFileHandler implements Handler{
    private Handler handler;
    private String handlerName;

    public ImageFileHandler(String handlername){
        this.handlerName = handlername;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;

    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("image"))
            System.out.println("Process image file by "+ handlerName);
        else if (handler!=null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
            }
        else
            System.out.println("File not supported");
    }


    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}
