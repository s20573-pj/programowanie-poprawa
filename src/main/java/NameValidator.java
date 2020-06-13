import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class NameValidator {
        @NotBlank
        @Size(min=4)
        private String name;

        @Future
        private Date validUntil;

        public NameValidator(@NotNull @Size(min = 4) String name, @Future Date validUntil) {
            this.name = name;
            this.validUntil = validUntil;
        }

        public String getName() {
            return name;
        }

        public Date getValidUntil() {
            return validUntil;
        }
}

