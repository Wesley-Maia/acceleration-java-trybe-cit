#Roteiro - Criação de Projeto com JPA/Hibernate

# 1- Criar um projeto Maven
# 	.Create a simple project	
#	.GroupID: br.com.alura
#	.ArtifactId: loja-maven-hibernate
#	.Version: 1.0-SNAPSHOT


# 2- Editar arquivo pom.xml

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<release>11</release>
				</configuration>
			</plugin>
		</plugins>
	</build>
	
	
	
	
	<dependencies>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>4.3.9.Final</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>4.3.8.Final</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.3.2</version>
        </dependency>
    </dependencies>
	
	
# 3- Criar arquivo META-INF/persistence.xml

<?xml version="1.0" encoding="UTF-8"?>

<persistence version="2.1"
             xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">

    <persistence-unit name="loja" transaction-type="RESOURCE_LOCAL">

        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

        <properties>
            <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/loja" />
            <property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver" />
            <property name="javax.persistence.jdbc.user" value="postgres" />
            <property name="javax.persistence.jdbc.password" value="123456" />

            <property name="hibernate.hbm2ddl.auto" value="update" />
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />
            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQL82Dialect" />
        </properties>

    </persistence-unit>

</persistence>


# 4- Criar arquivo class Produto

@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}


# 5- Criar arquivo class CadastroDeProdutos

public class CadastroDeProdutos {

    public static void main(String[] args) {
        Produto celular = new Produto();

        celular.setNome("Xiaomi");
        celular.setDescricao("Muito bom");
        celular.setPreco(new BigDecimal("800"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
    }
}