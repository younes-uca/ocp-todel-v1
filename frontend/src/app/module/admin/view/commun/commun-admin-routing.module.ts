
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { ProfesseurListAdminComponent } from './professeur-admin/list-admin/professeur-list-admin.component';
import { ClasseRoomListAdminComponent } from './classe-room-admin/list-admin/classe-room-list-admin.component';
import { NiveauListAdminComponent } from './niveau-admin/list-admin/niveau-list-admin.component';
import { EtudiantListAdminComponent } from './etudiant-admin/list-admin/etudiant-list-admin.component';
import { DisciplineListAdminComponent } from './discipline-admin/list-admin/discipline-list-admin.component';
import { NoteDisciplineListAdminComponent } from './note-discipline-admin/list-admin/note-discipline-list-admin.component';
import { NoteMatiereListAdminComponent } from './note-matiere-admin/list-admin/note-matiere-list-admin.component';
import { MatiereListAdminComponent } from './matiere-admin/list-admin/matiere-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'professeur',
                            children: [
                                {
                                    path: 'list',
                                    component: ProfesseurListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'classe-room',
                            children: [
                                {
                                    path: 'list',
                                    component: ClasseRoomListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'niveau',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'discipline',
                            children: [
                                {
                                    path: 'list',
                                    component: DisciplineListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'note-discipline',
                            children: [
                                {
                                    path: 'list',
                                    component: NoteDisciplineListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'note-matiere',
                            children: [
                                {
                                    path: 'list',
                                    component: NoteMatiereListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'matiere',
                            children: [
                                {
                                    path: 'list',
                                    component: MatiereListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class CommunAdminRoutingModule { }
