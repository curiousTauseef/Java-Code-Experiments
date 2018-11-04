package converter;

import com.documents4j.api.*;
import com.documents4j.job.LocalConverter;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WordToPdfConverter {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

        File wordFile = new File("src/resources/aWordDoc.docx"), target = new File( "src/resources/aPdf.pdf" );
        IConverter converter = LocalConverter.builder()
                .baseFolder(new File("src/resources/"))
                .workerPool(20, 25, 2, TimeUnit.SECONDS)
                .processTimeout(5, TimeUnit.SECONDS)
                .build();

            Future<Boolean> conversion = converter
            .convert(wordFile).as(DocumentType.MS_WORD)
            .to(target).as(DocumentType.PDF)
            .prioritizeWith(1000) // optional
            .schedule();
    }

}
