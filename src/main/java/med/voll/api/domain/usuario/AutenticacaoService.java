package med.voll.api.domain.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*classe implementada para lidar com autenticação, o @service serve para informar o spring que a classe é um componente e a classe deve implementar
* a classe UserDetailsService para ter as funcionalidades
*/
@Service
public class AutenticacaoService implements UserDetailsService {
    @Autowired
    private  UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByLogin(username);
    }
}
