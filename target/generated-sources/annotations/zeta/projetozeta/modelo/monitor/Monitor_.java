package zeta.projetozeta.modelo.monitor;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import zeta.projetozeta.modelo.usuario.Usuario;
import zeta.projetozeta.modelo.voo.VooPesquisa;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Monitor.class)
public abstract class Monitor_ {

	public static volatile SingularAttribute<Monitor, Usuario> usuario;
	public static volatile SingularAttribute<Monitor, Long> id;
	public static volatile ListAttribute<Monitor, VooPesquisa> vooMonitorados;

}

