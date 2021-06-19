# trabalhocd
# Instalando o MAVEN no Windows

Primeiro passo - Pré-requisito (JDK 1.7)
O principal requisito para instalar e usar o maven na sua máquina é ter previamente instalado o JDK (Java Development Kit) 1.7 ou superior.
Também é necessário configurar a variável de ambiente JAVA_HOME no seu computador. Mas isso eu vou mostrar como fazer ao longo do post.
Por agora tenha certeza que você tenha instalado o JDK 1.7 ou superior.

Segundo passo - Download do maven
O próximo passo é baixar o maven compactado em sua versão mais atual. Você precisa baixar o arquivo com os binários do maven, não é necessário baixar o arquivos-fonte. Ou seja, você vai baixar o arquivo que termina com -bin e não o arquivo que termina com -src.
Para baixar o maven, basta clicar aqui e fazer o download.
Você pode escolher qualquer formato de compactação para download, mas eu sugiro o arquivo -bin.zip, por ser o formato de compactação mais comum.

Terceiro passo - Descompactação
Após fazer o download do arquivo compactado, você deve descompactá-lo em uma pasta de sua preferência.
Mas é importante você saber que esta pasta será a pasta onde o maven estará "instalado".
Pode ser que quando você descompactou o arquivo zip a pasta C:\maven tenha ficado só com uma pasta com os arquivo do maven dentro, algo como C:\maven\apache-maven-3.5.4.
Não tem problema, basta se lembrar disso quando for configurar a variável de ambiente. Ou você pode mover os arquivos de dentro desta pasta e subir um nível, colocando-os em C:\maven. Você escolhe.

Quarto passo - Configurando as variáveis de ambiente
Agora vem a parte que faz o maven funcionar
Para fazer o maven funcionar você só precisa adicionar a pasta bin do maven na variável de ambiente PATH.
Se você nunca configurou uma variável de ambiente no Windows basta seguir esses passos.
	1. Clique com o botão direito do mouse no ícone do seu computador e clique em Propriedades.
	2. Clique em Configurações avançadas do sistema.
	3. Clique no botão Variáveis de ambiente dentro da aba Avançado. 
	4. Selecione a variável de ambiente PATH na lista e clique em Editar.
	5. Clique no botão Novo e adicione o caminho da pasta bin do maven: C:\maven\bin.
	6. Verifique se existe a variável de ambiente JAVA_HOME.
Precisamos saber se a variável de ambiente JAVA_HOME já existe no seu sistema ou se precisamos criá-la. 
Entre as variáveis de ambiente do seu sistema, verifique se já existe uma variável de ambiente chamada JAVA_HOME que contenha o caminho para o JDK instalado no seu computador.
Se não existir, você precisa criar essa nova variável de ambiente, clicando em Novo... e informando o nome JAVA_HOME e o valor com o caminho para a pasta onde o seu JDK está instalado.

Testando a instalação do maven
Para testar se a configuração do maven funcionou, abra o prompt de comando do seu computador e digite mvn.
Caso sua saída exiba como título “BUILD FAILURE” e apresente alguns erros, significa que você não configurou a variável de ambiente PATH com o caminho válido para a pasta bin do maven.
Neste caso, volte para o início deste Quarto passo - Configurando as variáveis de ambiente e certifique-se que o caminho da pasta bin do maven esteja na variável de ambiente PATH. Após essa correção, feche e abra novamente o prompt de comando.
