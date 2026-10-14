package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    //ISBN?

    @JsonProperty("titulo")
    @NotBlank(message = "Título do livro não pode ser vazio")
    private String titulo;

    @JsonProperty("ano")
    @NotBlank(message = "O ano do livro não pode ser vazio")
    private String ano;

    @JsonProperty("edicao")
    @NotBlank(message = "A edição do livro não pode ser vazio")
    private String edicao;    
}