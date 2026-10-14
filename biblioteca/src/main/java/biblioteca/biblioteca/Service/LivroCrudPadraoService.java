package biblioteca.biblioteca.Service;

import biblioteca.biblioteca.Dto.AutorPostPutDto;
import biblioteca.biblioteca.Dto.AutorResponseDto;
import biblioteca.biblioteca.Dto.LivroPostPutDto;
import biblioteca.biblioteca.Dto.LivroResponseDto;
import biblioteca.biblioteca.Model.Autor;
import biblioteca.biblioteca.Repository.AutorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LivroCrudPadraoService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired 
    AutorRepository autorRepository;

    @Override
    public LivroResponseDto criarLivro(LivroPostPutDto livroPostPutDto) {
        //TODO
        return LivroResponseDto;
    }

    @Override 
    public List<LivroResponseDto> buscarTodosLivros() {
        //TODO
        return List;
    }

    @Override
    public LivroResponseDto buscarLivro(Long id) {
        //TODO
        return LivroResponseDto;
    }

    @Override
    public LivroResponseDto atualizarLivro(Long id, LivroPostPutDto livroPostPutDto) {
        //TODO
        return LivroResponseDto;
    }

    @Override
    public void removerLivro(Long id) {
        //TODO
    }
}