-- V5__insert_lucas_profile.sql

-- Profile
INSERT INTO profile (id, name, mid_name, last_name, bio, photo_url, job_title, location)
VALUES (
           'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
           'Lucas',
           'Oliveira',
           'Campos',
           'Desenvolvedor Back-End com experiência em Java, Spring Boot e .NET, atuando em projetos para diferentes clientes em consultoria de tecnologia. Histórico comprovado em refatoração de APIs REST, migração de versões de plataformas, observabilidade com OpenTelemetry/Prometheus/Grafana, e desenvolvimento de sistemas financeiros de alta criticidade. Autodidata desde 2021, com foco em arquitetura limpa, boas práticas e entrega de valor.',
           null,
           'Desenvolvedor Back-End | Java | Spring Boot | .NET',
           'São Paulo, Brasil'
       );

-- Emails
INSERT INTO profile_email (id, profile_id, type, email) VALUES
    (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'WORK', 'lucasolisocialmedia@gmail.com');

-- Social links
INSERT INTO social_link (id, profile_id, platform, url) VALUES
                                                            (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'LinkedIn', 'https://linkedin.com/in/lucas-oliveira-campos'),
                                                            (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'GitHub', 'https://github.com/lucasoliveira04'),
                                                            (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Portfolio', 'https://lucasoliveira04.com');

-- Experiences
INSERT INTO experience (id, profile_id, company, role, description, started_at, ended_at, current) VALUES
                                                                                                       (
                                                                                                           gen_random_uuid(),
                                                                                                           'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                           'SMIT – Soluções Mobile Inovadoras Tecnológicas (Cliente: Rede Compras)',
                                                                                                           'Desenvolvedor Back-End',
                                                                                                           'Refatorei APIs REST e desenvolvi sistemas com comunicação TCP em ambiente de alta criticidade. Conduzi migração de aplicações Java 17 para Java 21 e Java 25. Participei do projeto de carteira virtual para cartões LeCard, incluindo tokenização e processamento de transações. Implementei observabilidade com OpenTelemetry, Prometheus, Loki e Promtail. Criei pipeline de deploy automatizado com GitHub Actions.',
                                                                                                           '2025-08-01',
                                                                                                           null,
                                                                                                           true
                                                                                                       ),
                                                                                                       (
                                                                                                           gen_random_uuid(),
                                                                                                           'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                           'SMIT – Soluções Mobile Inovadoras Tecnológicas (Cliente: TopDoc)',
                                                                                                           'Desenvolvedor Back-End',
                                                                                                           'Conduzi a migração de API legada do .NET 3 para .NET 9. Realizei refatoração arquitetural com foco em separação de responsabilidades e adoção de boas práticas. Reduzi débito técnico e melhorei a manutenibilidade e escalabilidade da aplicação.',
                                                                                                           '2026-01-01',
                                                                                                           null,
                                                                                                           true
                                                                                                       ),
                                                                                                       (
                                                                                                           gen_random_uuid(),
                                                                                                           'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                           'Planet Eco Services',
                                                                                                           'Desenvolvedor Full Stack',
                                                                                                           'Desenvolvi microserviços em Python (Flask) com RabbitMQ e Redis para geração automatizada de relatórios de consumo de água. Criei central web interna em React e TypeScript para visualização de dados. Implementei manutenção e otimização de queries no Oracle. Desenvolvi bots integrados ao WhatsApp e Telegram para automatização de notificações.',
                                                                                                           '2025-04-01',
                                                                                                           '2025-08-01',
                                                                                                           false
                                                                                                       ),
                                                                                                       (
                                                                                                           gen_random_uuid(),
                                                                                                           'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                           'Projeto Acadêmico – Nosso Mar',
                                                                                                           'Desenvolvedor de Jogos',
                                                                                                           'Desenvolveu jogo mobile em Unity e C# com foco em conscientização ambiental, atuando como programador e líder técnico. Publicou o jogo na Google Play Store.',
                                                                                                           '2024-06-01',
                                                                                                           '2025-02-01',
                                                                                                           false
                                                                                                       );

-- Education
INSERT INTO education (id, profile_id, institution, degree, field, started_at, ended_at) VALUES
    (
        gen_random_uuid(),
        'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
        'Universidade Nove de Julho (UNINOVE)',
        'Bacharel',
        'Ciência da Computação',
        '2023-02-01',
        '2026-12-01'
    );

-- Skills
INSERT INTO skill (id, profile_id, name, category, level) VALUES
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Java', 'Backend', 'Avançado'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Spring Boot', 'Backend', 'Avançado'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'C#', 'Backend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', '.NET', 'Backend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Python', 'Backend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'TypeScript', 'Frontend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'React', 'Frontend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Flask', 'Backend', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'RabbitMQ', 'Mensageria', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Redis', 'Cache', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'PostgreSQL', 'Banco de Dados', 'Avançado'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Oracle', 'Banco de Dados', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Docker', 'DevOps', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'GitHub Actions', 'DevOps', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Prometheus', 'Observabilidade', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'OpenTelemetry', 'Observabilidade', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Loki', 'Observabilidade', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'REST API', 'Arquitetura', 'Avançado'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Microserviços', 'Arquitetura', 'Intermediário'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'SOLID', 'Boas Práticas', 'Avançado'),
                                                              (gen_random_uuid(), 'a1b2c3d4-e5f6-7890-abcd-ef1234567890', 'Clean Code', 'Boas Práticas', 'Avançado');

-- Projects
INSERT INTO project (id, profile_id, name, description, repo_url, live_url, started_at, ended_at) VALUES
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'Nosso Mar – Salve os Patinhos',
                                                                                                          'Jogo mobile desenvolvido na Unity com C# com foco em conscientização ambiental. Atuei como programador e líder técnico, publicando o jogo na Google Play Store.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          '2024-06-01',
                                                                                                          '2025-02-01'
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'DeckIfy',
                                                                                                          'Plataforma web que automatiza estudos gerando FlashCards Anki com AI. Desenvolvido com React.js e Python, 100% Open Source.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'API de Processamento de Imagens',
                                                                                                          'Microserviço em Flask para redimensionamento assíncrono de imagens. Utiliza Redis para cache, RabbitMQ para mensageria e PIL para processamento. Containerizado com Docker Compose.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'API de Autenticação com JWT',
                                                                                                          'Microserviço de autenticação com JWT e PostgreSQL para login seguro e escalável. Hospedado na Render.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'Anki Convert API',
                                                                                                          'API que converte conjuntos de flashcards em arquivos .apkg compatíveis com o Anki, facilitando a criação de materiais de estudo com repetição espaçada.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'Restaurante Web',
                                                                                                          'Sistema de gerenciamento de cardápio desenvolvido com React.js e Firebase. Inclui adição, edição e exclusão de itens, geração de NF após pagamento e interface para administradores.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'ChatBot AI',
                                                                                                          'Chatbot inteligente em JavaScript com IA para conversas realistas e interativas.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      ),
                                                                                                      (
                                                                                                          gen_random_uuid(),
                                                                                                          'a1b2c3d4-e5f6-7890-abcd-ef1234567890',
                                                                                                          'Artigo Científico',
                                                                                                          'Artigo que analisa os impactos da pandemia na economia da Airbnb, utilizando Python para coleta, filtragem e análise de dados.',
                                                                                                          'https://github.com/lucasoliveira04',
                                                                                                          null,
                                                                                                          null,
                                                                                                          null
                                                                                                      );

-- Certificates (vazio por enquanto, adiciona quando tiver)