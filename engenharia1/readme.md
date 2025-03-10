﻿# Wesley Xavier - Resumo dos textos fornecidos pelo professor no Teams.
## Texto Original

### Parte 1

What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

### Parte 2

Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth

## Resumo solicitado pelo professor.

A engenharia de software procurar seguir um padrão mais rigorozo para a construção de softwares que serão aplicações reais do dia a dia, porém, não apresenta ainda tanto rigor como as engenharias tradicionais embora diferentemente de apenas programar códigos, procurar aplicar os métodos da engenharia na construção dessas aplicações.
A engenharia de software aplica esses métodos preocupando-se com todas as ferramentas e processos que utiliza para construir e manter esse software ao longo de tempo, para que ele se mantenha viável em relação ao custo, escalabilidade e manutenabilidade com o passar dos anos.

## Três exemplos de Tradeoff

- Velocidade vs Qualidade
Entregar um software rapidamente pode ser crucial para atender prazos ou aproveitar oportunidades de mercado. No entanto, isso pode levar a um código menos limpo, com mais "bugs" e dificuldades de manutenção no futuro.
Dedicar mais tempo à qualidade do código resulta em um software mais robusto, fácil de manter e com menos erros. Porém, isso pode atrasar o lançamento do produto.

- Recursos vs. desempenho
Adicionar mais funcionalidades a um software pode torná-lo mais completo e atrativo para os usuários. Porém, isso pode exigir mais recursos de hardware (memória, processamento), tornando o software mais lento ou exigindo equipamentos mais potentes.
Otimizar o software para que ele funcione de forma rápida e eficiente pode exigir a remoção de algumas funcionalidades ou a simplificação de outras.

- Custo vs. segurança:
Implementar medidas de segurança robustas pode ser caro, exigindo investimentos em ferramentas, treinamento e pessoal especializado.
Ignorar ou negligenciar a segurança pode reduzir os custos no curto prazo, mas aumenta o risco de ataques cibernéticos, perda de dados e danos à reputação da empresa.

## Sobre o Slide 57
A melhor maneira de construir um projeto complexo de software é construindo um sistema básico de ponta a ponta, dessa forma o cliente possui uma aplicação funcionando que resolve mesmo que de forma não ideal o problema.
