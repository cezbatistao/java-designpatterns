package br.com.batistao

import br.com.batistao.command.portao.AbrirPortaoCommand
import br.com.batistao.command.portao.FecharPortaoCommand
import br.com.batistao.controle.Controle
import spock.lang.Specification

/**
 * Created by ceb on 18/05/16.
 */
class CommandPatternUnitSpec extends Specification {

    def "O estado inicial do portão deve ser fechado"() {
        when:
        Portao portaoDeCasa = new Portao()

        then:
        assert portaoDeCasa.estado == Portao.EstadoPortao.FECHADO
    }

    def "Ao abrir o portão o estado dele deve mudar para ABERTO"() {
        given:
        Portao portaoDeCasa = new Portao()
        Controle controle = new Controle(new AbrirPortaoCommand(portaoDeCasa), new FecharPortaoCommand(portaoDeCasa))

        when:
        controle.abrirPortao()

        then:
        assert portaoDeCasa.estado == Portao.EstadoPortao.ABERTO
    }

    def "Ao fechar o portão ele estando aberto então deve mudar estado para FECHADO"() {
        given:
        Portao portaoDeCasa = new Portao()
        Controle controle = new Controle(new AbrirPortaoCommand(portaoDeCasa), new FecharPortaoCommand(portaoDeCasa))
        controle.abrirPortao()

        when:
        controle.fecharPortal()

        then:
        assert portaoDeCasa.estado == Portao.EstadoPortao.FECHADO
    }

    def "Ao abrir o portão e desfazer essa ação o estado dele deve voltar para o estado anterior"() {
        given:
        Portao portaoDeCasa = new Portao()
        Controle controle = new Controle(new AbrirPortaoCommand(portaoDeCasa), new FecharPortaoCommand(portaoDeCasa))

        assert portaoDeCasa.estado == Portao.EstadoPortao.FECHADO

        controle.abrirPortao()

        assert portaoDeCasa.estado == Portao.EstadoPortao.ABERTO

        when:
        controle.desfazer()


        then:
        assert portaoDeCasa.estado == Portao.EstadoPortao.FECHADO
    }
}
