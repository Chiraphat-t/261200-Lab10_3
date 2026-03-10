import org.w3c.dom.Text;

void main() {
    File textFile = new File("README.txt", "text", "/home/docs");
    File docFile = new File("Document.doc", "document", "/home/docs");
    File imageFile = new File("Picture.jpg", "image", "/home/images");
    File audioFile = new File("Song.mp3", "audio", "/home/audio");

    Handler textHandler = new TextFileHandler("Text");
    Handler docHandler = new DocumentFileHandler("doc");
    Handler imgHandler = new ImageFileHandler("pic");
    Handler audiHandler = new AudioFileHandler("song");

    textHandler.setHandler(docHandler);
    docHandler.setHandler(imgHandler);
    imgHandler.setHandler(audiHandler);



// Process files
    System.out.println("Processing text file:");
    textHandler.process(textFile);
    System.out.println("Processing document file:");
    textHandler.process(docFile);
    System.out.println("Processing audio file:");
    textHandler.process(audioFile);


}
