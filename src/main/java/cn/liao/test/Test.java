package cn.liao.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuxiang Liao on 2020-01-29 17:04.
 */
public class Test {
	public static String translatedText = "＃SaaS，PaaS，IaaS\n" + "\n" + "##主要区别摘要\n" + "\n" +
			"！[SaaS，PaaS和IaaS之间的差异]（https://blogs.bmc.com/wp-content/uploads/2017/09/iaas-paas-saas-comparison-1024x759.jpg）\n" +
			"\n" + "## SaaS，PaaS和IaaS的常见示例\n" + "\n" + "| **平台类型** | **常见示例** |\n" +
			"| ----------------- | -------------------------------------------------- ---------- |\n" +
			"| ** SaaS ** | Google Apps，Dropbox，Salesforce，Cisco WebEx，Concur，GoToMeeting |\n" +
			"| ** PaaS ** | AWS Elastic Beanstalk，Windows Azure，Heroku，Force.com，Google App Engine，Apache Stratos，OpenShift |\n" +
			"| ** IaaS ** | DigitalOcean，Linode，Rackspace，Amazon Web Services（AWS），Cisco Metapod，Microsoft Azure，Google Compute Engine（GCE）|\n" +
			"\n" + "## SaaS：软件即服务\n" + "\n" +
			"软件即服务，也称为云应用程序服务，是云市场中企业最常用的选项。 SaaS利用Internet将由第三方供应商管理的应用程序交付给用户。大多数SaaS应用程序直接通过您的Web浏览器运行，这意味着它们不需要在客户端进行任何下载或安装。\n" +
			"\n" + "### SaaS交付\n" + "\n" +
			"由于其Web交付模型，SaaS消除了让IT员工在每台计算机上下载和安装应用程序的需要。借助SaaS，供应商可以管理所有潜在的技术问题，例如数据，中间件，服务器和存储，从而简化了对业务的维护和支持。\n" +
			"\n" + "### SaaS的优势\n" + "\n" +
			"作为重用，它可以大大减少在繁琐的任务（如安装，管理和升级软件）上花费的时间和金钱。这为技术人员腾出了足够的时间来花更多的时间在组织内更紧迫的问题上。\n" + "\n" + "### SaaS特征\n" +
			"\n" + "有几种方法可以帮助您确定何时使用SaaS：\n" + "\n" + "-从中央位置进行管理\n" + "-托管在远程服务器上\n" + "-可通过互联网访问\n" +
			"-用户不对硬件或软件更新负责\n" + "\n" + "###何时使用SaaS\n" + "\n" + "SaaS在某些情况下可能是最有益的选择，包括：\n" + "\n" +
			"-需要快速启动电子商务并且没有时间解决服务器问题或软件的初创公司或小型公司\n" + "-需要快速，轻松和负担得起的协作的短期项目\n" + "-不需要太多的应用程序，例如税务软件\n" +
			"-同时需要网络和移动访问的应用\n" + "\n" + "SaaS的局限性和问题\n" + "\n" +
			"-**互操作性。**如果SaaS应用程序的设计不遵循开放式集成标准，则与现有应用程序和服务的集成可能成为主要问题。在这种情况下，组织可能需要设计自己的集成系统或减少对SaaS服务的依赖性，而这并非总是可能的。\n" +
			"-**供应商锁定。**供应商可能使加入服务变得容易，也难以摆脱。例如，数据可能无法在技术上或成本效益上跨其他供应商的SaaS应用程序移植，而不会产生大量成本或内部工程返工。并非每个供应商都遵循标准的API，协议和工具，但是某些业务任务可能需要这些功能。\n" +
			"-**缺乏集成支持。**许多组织需要与本地应用程序，数据和服务进行深度集成。 SaaS供应商在这方面可能会提供有限的支持，从而迫使组织在设计和管理集成方面投入内部资源。集成的复杂性可能进一步限制SaaS应用程序或其他相关服务的使用方式。\n" +
			"-**数据安全性。**为了执行必要的软件功能，可能必须将大量数据交换到SaaS应用程序的后端数据中心。将敏感的业务信息转移到基于公共云的SaaS服务可能会导致安全性和合规性受损，此外还需要迁移大量数据工作负载。\n" +
			"-**自定义。** SaaS应用提供最少的自定义功能。由于不存在一种千篇一律的解决方案，因此用户可能仅限于供应商提供的特定功能，性能和集成。相反，一些软件开发套件（SDK）随附的本地解决方案提供了高度的定制选项。\n" +
			"-**缺乏控制。** SaaS解决方案涉及将控制权移交给第三方服务提供商。这些控件不仅限于软件-在版本，更新或外观方面-而且还包括数据和管理。因此，客户可能需要重新定义其数据安全性和治理模型，以适应SaaS服务的特性和功能。\n" +
			"-**功能限制。**由于SaaS应用程序通常以标准化形式出现，因此功能的选择可能会折衷于与安全性，成本，性能或其他组织策略的权衡。此外，供应商的锁定，成本或安全性问题可能意味着将来无法切换供应商或服务来满足新功能要求。\n" +
			"-**性能和停机时间。**由于供应商控制和管理SaaS服务，因此您的客户现在依靠供应商来维持服务的安全性和性能。尽管有适当的服务级别协议（SLA）保护，但计划内和计划外的维护，网络攻击或网络问题仍可能影响SaaS应用程序的性能。\n" +
			"\n" + "### SaaS的示例\n" + "\n" +
			"这些是SaaS的几种流行示例，包括：[Google GSuite]（https://gsuite.google.com/）（应用程序），[Dropbox]（https://www.dropbox.com/），[Salesforce]（ https://www.salesforce.com/)、[Cisco WebEx]（https://www.webex.com/），[SAP Concur]（https://www.concur.com/）和[GoToMeeting] （https://www.gotomeeting.com/）。\n" +
			"\n" + "## PaaS：平台即服务\n" + "\n" +
			"云平台服务（也称为平台即服务（PaaS））为某些软件提供云组件，同时主要用于应用程序。 PaaS为开发人员提供了一个框架，开发人员可以在此框架上建立并使用该框架来创建自定义应用程序。所有服务器，存储和网络都可以由企业或第三方提供商管理，而开发人员可以维护应用程序的管理。\n" +
			"\n" + "### PaaS交付\n" + "\n" +
			"PaaS的交付模型与SaaS相似，不同的是PaaS提供了软件创建平台，而不是通过Internet交付软件。该平台通过Web交付，使开发人员可以自由地专注于构建软件，而不必担心操作系统，软件更新，存储或基础架构。\n" +
			"\n" + "PaaS允许企业设计和创建内置于带有特殊软件组件的PaaS中的应用程序。这些应用程序有时被称为中间件，由于具有某些云特性，因此具有可伸缩性和高可用性。\n" + "\n" +
			"### PaaS的优势\n" + "\n" + "无论您的公司规模大小，使用PaaS都有许多优势，包括：\n" + "\n" + "-简单，经济高效的应用开发和部署\n" + "-可扩展\n" +
			"-高度可用\n" + "-开发人员可以自定义应用程序，而无需维护软件\n" + "-大大减少了所需的编码量\n" + "-商业政策自动化\n" + "-轻松迁移到混合模型\n" + "\n" +
			"### PaaS特性\n" + "\n" + "PaaS具有许多将其定义为云服务的特征，包括：\n" + "\n" + "-建立在虚拟化技术的基础之上，因此随着业务的变化，可以轻松地按比例放大或缩小资源\n" +
			"-提供各种服务，以协助开发，测试和部署应用\n" + "-通过同一开发应用程序可访问众多用户\n" + "-整合网络服务和数据库\n" + "\n" + "###何时使用PaaS\n" + "\n" +
			"在某些情况下，使用PaaS是有益的，有时甚至是必要的。例如，当多个开发人员在同一个开发项目上工作时，PaaS可以简化工作流程。如果必须包括其他供应商，PaaS可以为整个过程提供极大的速度和灵活性。如果您需要创建自定义的应用程序，则PaaS特别有用。如果您正在快速开发或部署应用程序，则该云服务还可以大大降低成本，并且可以简化一些挑战。\n" +
			"\n" + "### PaaS的局限性和担忧\n" + "\n" +
			"-**数据安全性。**组织可以使用PaaS解决方案运行自己的应用程序和服务，但是驻留在第三方，由供应商控制的第三方云服务器中的数据会带来安全风险和担忧。您的安全选项可能会受到限制，因为客户可能无法使用特定的托管策略来部署服务。\n" +
			"-**集成**。连接存储在现场数据中心或非内部云中的数据的复杂性增加，这可能影响PaaS产品可以采用哪些应用程序和服务。尤其是当不是为云构建旧版IT系统的每个组件时，与现有服务和基础架构的集成都可能是一个挑战。\n" +
			"-**供应商锁定。**推动特定PaaS解决方案决策的业务和技术要求将来可能不再适用。如果供应商未设置方便的迁移策略，则在不影响业务的情况下可能无法切换到其他PaaS选项。\n" +
			"-**旧系统的定制。** PaaS可能不是现有旧应用和服务的即插即用解决方案。相反，旧系统要与PaaS服务一起使用可能需要进行一些自定义和配置更改。最终的定制可能导致复杂的IT系统，从而可能完全限制PaaS投资的价值。\n" +
			"-**运行时问题。**除了与特定应用和服务相关的限制外，PaaS解决方案可能未针对您选择的语言和框架进行优化。特定的框架版本可能不可用，或者无法与PaaS服务一起最佳使用。客户可能无法使用该平台开发自定义依赖项。\n" +
			"-**操作限制。**具有管理自动化工作流程的自定义云操作可能不适用于PaaS解决方案，因为该平台往往会限制最终用户的操作能力。尽管这旨在减轻最终用户的操作负担，但是操作控制的丢失可能会影响PaaS解决方案的管理，配置和操作方式。\n" +
			"\n" + "### PaaS的示例\n" + "\n" +
			"PaaS的流行示例包括[AWS Elastic Beanstalk]（https://aws.amazon.com/elasticbeanstalk/），[Windows Azure]（https://azure.microsoft.com/zh-cn/free/windows-server- on-azure /），[Heroku]（https://www.heroku.com/），[Force.com]（https://developer.salesforce.com/platform/force.com），[Google App Engine] （https://cloud.google.com/appengine/）和[OpenShift]（https://www.openshift.com/）。\n" +
			"\n" + "## IaaS：基础架构即服务\n" + "\n" +
			"云基础架构服务（称为基础架构即服务（IaaS））由高度可扩展的自动化计算资源组成。 IaaS是完全[自助服务]（https://www.bmc.com/blogs/self-service-thrives-clouds/），用于访问和监视计算机，网络，存储和其他服务。 IaaS允许企业按需和按需购买资源，而不必直接购买硬件。\n" +
			"\n" + "### IaaS交付\n" + "\n" +
			"IaaS通过虚拟化技术提供了包括服务器，网络，操作系统和存储在内的云计算基础架构。这些云服务器通常通过仪表板或API提供给组织，从而使IaaS客户端可以完全控制整个基础架构。 IaaS提供与传统数据中心相同的技术和功能，而无需物理维护或管理所有数据中心。 IaaS客户端仍然可以直接访问其服务器和存储，但是它们都是通过云中的“虚拟数据中心”外包的。\n" +
			"\n" +
			"与SaaS或PaaS相对，IaaS客户端负责管理各个方面，例如应用程序，运行时，操作系统，中间件和数据。但是，IaaS的提供商管理服务器，硬盘驱动器，网络，虚拟化和存储。一些提供商甚至提供超出虚拟化层的更多服务，例如数据库或消息队列。\n" +
			"\n" + "### IaaS的优势\n" + "\n" + "IaaS具有许多优势，包括：\n" + "\n" + "-最灵活的云计算模型\n" + "-易于自动实现存储，网络，服务器和处理能力的部署\n" +
			"-可以根据消耗量购买硬件\n" + "-客户保留对其基础架构的完全控制\n" + "-可以根据需要购买资源\n" + "-高度可扩展\n" + "\n" + "### IaaS特性\n" + "\n" +
			"定义IaaS的特征包括：\n" + "\n" + "-资源可作为服务使用\n" + "-费用视消费而定\n" + "-服务具有高度可扩展性\n" + "-单个硬件上有多个用户\n" +
			"-组织保留对基础架构的完全控制\n" + "-动态灵活\n" + "\n" + "###何时使用IaaS\n" + "\n" + "就像SaaS和PaaS一样，在某些情况下IaaS最有利。\n" + "\n" +
			"初创企业和小型公司可能更喜欢IaaS，以避免花费时间和金钱来购买和创建硬件和软件。较大的公司可能希望保留对其应用程序和基础结构的完全控制权，但是他们只想购买他们实际消费或需要的东西。像IaaS的可伸缩性一样，公司经历了快速的增长，随着需求的发展，他们可以轻松地更换特定的硬件和软件。每当您不确定新应用程序的需求时，IaaS都会提供足够的灵活性和可扩展性。\n" +
			"\n" + "### IaaS的局限性和问题\n" + "\n" +
			"与SaaS和PaaS模型相关的许多限制（例如数据安全性，成本超支，供应商锁定和自定义问题）也适用于IaaS模型。 IaaS的特殊限制包括：\n" + "\n" +
			"-**安全性。**当客户控制应用程序，数据，中间件和OS平台时，仍然可以从主机或其他虚拟机（VM）发出安全威胁。内部威胁或系统漏洞可能会将主机基础结构和VM之间的数据通信暴露给未经授权的实体。\n" +
			"-**传统系统在云中运行。**尽管客户可以在云中运行旧版应用程序，但基础架构可能无法设计为提供特定控件以保护旧版应用程序。在将旧版应用迁移到云之前，可能需要对旧版应用进行较小的增强，这可能会导致新的安全问题，除非对IaaS系统中的安全性和性能进行了充分的测试。\n" +
			"-**内部资源和培训。**劳动力可能需要其他资源和培训，以学习如何有效管理基础架构。客户将负责数据安全性，备份和业务连续性。但是，由于对基础架构的控制不足，如果没有足够的内部培训和可用资源，则可能难以对资源进行监视和管理。\n" +
			"-**多租户安全性。**由于硬件资源是在可用时在用户之间动态分配的，因此要求供应商确保其他客户无法访问以前客户存放在存储资产中的数据。同样，客户必须依靠供应商来确保VM在多租户云架构中得到充分隔离。\n" +
			"\n" + "### IaaS的示例\n" + "\n" +
			"IaaS的流行示例包括[DigitalOcean]（https://www.digitalocean.com/），[Linode]（https://www.linode.com/），[Rackspace]（https://www.rackspace.com /），[Amazon Web Services（AWS）]（https://aws.amazon.com/），[Cisco Metacloud]（https://www.cisco.com/c/en/us/products/cloud-systems -management / metacloud / index.html），[Microsoft Azure]（https://azure.microsoft.com/en-us/）和[Google Compute Engine（GCE）]（https://cloud.google.com /计算/）。\n";
	private String  string;
	public static void main(String[] args) throws IOException {
//		//compare
//		String[] list = translatedText.split("\n");
////		Arrays.stream(list).forEach(System.out::print);
//		List<String> list1 = Arrays.asList(list);
////		list1.stream().forEach(System.out::println);

//		Test test = new Test();
//		List list = new ArrayList();
//		System.out.println(test.string.equals(""));

		BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/liao/Desktop/test1.md"));
		writer.write("111");
		writer.write("\r\n");
		writer.write("222");
		writer.newLine();
		writer.write("333");
//		writer.write("444");
		writer.flush();
		writer.close();
	}
}
