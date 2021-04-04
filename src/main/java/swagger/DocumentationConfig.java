package swagger;

import io.swagger.annotations.Contact;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Info;

@SwaggerDefinition(
        info = @Info(
                description = "Book resources",
                version = "V1.0.1",
                title = "Book Resource API",
                contact = @Contact(
                   name = "Niveditha Ramu", 
                   email = "niveditharamu.54@gmail.com",
                   url = "http://www.bookservice.com"
                    ),
                
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json", "application/xml"},
        produces = {"application/json", "application/xml"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS}
        
)
public interface DocumentationConfig {

}