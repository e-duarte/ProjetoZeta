package zeta.projetozeta.modelo.voo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import zeta.projetozeta.modelo.historicovoo.HistoricoVoo;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Voo.class)
public abstract class Voo_ extends zeta.projetozeta.modelo.voo.AbstractVoo_ {

	public static volatile ListAttribute<Voo, HistoricoVoo> historico;
	public static volatile SingularAttribute<Voo, String> duracao;
	public static volatile SingularAttribute<Voo, String> idVoo;
	public static volatile SingularAttribute<Voo, String> companhia;

}

